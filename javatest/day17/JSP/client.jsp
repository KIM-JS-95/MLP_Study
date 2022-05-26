<%@ page contentType="text/html; charset=UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>제시어</title>
        <script src="ajax.js"></script>
        <style>
            #suggest {
                display: block;
                position: static;
                left: 0px;
                top: 30px;
                color: #000000;
                background: #EAEAEA;
                width: 500px"

            }
        </style>
        <script>
            function send() {
                let keyword = document.search.keyword.value;
       
                let params = `keyword=\${keyword}`;
        
                if (keyword.length > 0) {
                    sendKeyword(params)
                        .then(text => {

                            let result = text.split('|');

                            // 갯수, 문자열을 정수로 변환
                            let count = parseInt(result[0]);

                            let keywordList = null;

                            if (count > 0) {
                                // ,를 구분한 1차원 배열 생성
                                keywordList = result[1].split(',');

                                let html = '';
                                html += "등록된 쿼리 목록(선택하세요.)<br>";

                                for (var i = 0; i < keywordList.length; i++) {
                                    html += `<a href=\"javascript:select(\'\${keywordList[i]}\')\">\${keywordList[i]}</a><br>`;
                                }

                                // 목록을 출력할 DIV 태그
                                let listView = document.getElementById('suggestList');

                                // DIV 태그 값 저장
                                listView.innerHTML = html;

                                // 목록을 가지고 있는 DIV 태그 출력
                                show('suggest');
                            } else {
                                hide('suggest');
                            }

                        })
                        .catch(console.log);

                }
                else {
                    hide('suggest');
                }
            }

            function frmSend(f) {
                f.submit();
            }
        </script>


    </head>

    <body>

        <form name="search" action="./proc.jsp" method="post">
            <input type="text" name="keyword" id="keyword" onkeyup="send()" size="70" />
            <button>검색</button>

            <!-- 서버로부터 검색된 목록 출력 -->
            <div id="suggest">
                <div id="suggestList"></div>
            </div>
        </form>
    </body>

    </html>
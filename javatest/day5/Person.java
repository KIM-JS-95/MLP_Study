class Person {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();

        String file = "\"C:\\Program Files (x86)\\Steam\\Steam.exe\"";

        Process process;

        try{
            process = rt.exec(file);
            process.waitFor();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}



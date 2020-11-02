
class ipValidator {

    //public void kelimedeneme() {
        //System.out.println("kelimerler burada calisacak..");}
    private static String ipPrefix = "11.122.10.";

    public static String validate(String ip) {

        if(!ip.startsWith(ipPrefix)) {
            return "GeÃ§ersiz IP girildi, IP : 11.122.10 seklinde baslamali ! ";
        }

        String mesaj = "Devoloper IP: " + ip;
        String[] ipSegments = ip.split("\\.");
        String lastSegment = ipSegments[ipSegments.length-1];
        if(ipSegments.length!= 4) {
            return "Ip uzunluğu yanlış, ip düzenleyeniz !! ";
        }
        return mesaj;
    }
}

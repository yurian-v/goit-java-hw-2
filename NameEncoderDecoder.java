class NameEncoderDecoder{

public String encode(String name){
        String codingName = name.replace("e", "1").replace("u", "2").replace("i", "3").replace("o", "4").replace("a", "5");
            return "NOTFORYOU" + "" + codingName + "" + "YESNOTFORYOU";

}
public String decode(String name){
        String deCodingName = name.replace("1", "e").replace("2", "u").replace("3", "i").replace("4", "o").replace("5", "a");
        String deCodingNameSecond = deCodingName.replace ("NOTFORYOU", "").replace("YES", "");
            return deCodingNameSecond;
}

public static void main(String[] args) {
        NameEncoderDecoder names = new NameEncoderDecoder();
       
        String encode = names.encode("Crab");
        System.out.println("Crab = " + names.encode("Gurk"));
  
  String decode = names.decode("NOTFORYOUCr5bYESNOTFORYOU");
        System.out.println("NOTFORYOUCr5bYESNOTFORYOU = " + names.decode("NOTFORYOUCr5bYESNOTFORYOU"));
}
}

package io.github.ndimovt.scjpchapter6.regex;

public class GenerateNumber {
    private String prefixGenerator(){
        String prefix = null;
        for (int i = 0; i <3 ; i++) {
            int a = (int)(Math.random()*3);
            if(a == 0){
                prefix = "380";
            } else if (a == 1) {
                prefix = "383";
            } else if (a == 2) {
                prefix = "389";
            }
        }
        return prefix;
    }
    private String barcodeCreator() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 9);
            sb.append(a);
        }
        return sb.toString();
    }

    public String barcode(){
        StringBuilder sb = new StringBuilder();
        sb.append(prefixGenerator()).append(barcodeCreator());
        return sb.toString();
    }


}

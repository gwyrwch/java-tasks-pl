package org.san.zadania.main.Task6;

enum Color {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");

    private String code;

    Color(String code){
        this.code = code;
    }

    public String getCode()  { return code;}

    public void setCode(String code) {
        this.code = code;
    }
}

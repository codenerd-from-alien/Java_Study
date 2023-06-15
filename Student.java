public class Student {
    private String name;
    private int ban;
    private int no;
    private int kor;
    private int eng;
    private int math;
    Student(){}
    Student(String name, int ban,int no,int kor,int eng,int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }


    public int getTotal(){
        return getKor() + getEng() + getMath();
    }

    public float getAverage(){
        float return_value = (float)getTotal() /3 ;
        return (float) (Math.ceil(return_value *10)/10.0);
    }

    public String info(){
        String st_name = getName();
        int st_ban = getBan();
        int st_no = getNo();
        int st_kor = getKor();
        int st_eng = getEng();
        int st_math = getMath();
        String result =st_name + "," + st_no +"," +st_ban +"," + st_kor +"," + st_eng +"," + st_math + "," + getTotal()+ "," + getAverage();
        return result;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동"; 
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름 :"+s.name); 
        System.out.println("총점 :"+s.getTotal()); 
        System.out.println("평균 :"+s.getAverage());
    }
}


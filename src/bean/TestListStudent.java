package bean;

//学生番号とテスト結果を格納するBean

public class TestListStudent{
	private String subjectName;//科目名
	private String subjectCd;//科目コード
	private int num;//回数
	private int point;//点数

	public String getSubjectName(){
		return subjectName;
	}
	public void setSubjectName(String subjectName){
		this.subjectName=subjectName;
	}
	public String getSubjectCd(){
		return subjectCd;
	}
	public void setSubjectCd(String subjectCd){
		this.subjectCd=subjectCd;
	}
	public int getNum(){
		return num;
	}
	public void setNum(int num){
		this.num=num;
	}
	public int getPoint(){
		return point;
	}
	public void setPoint(int point){
		this.point=point;
	}
}

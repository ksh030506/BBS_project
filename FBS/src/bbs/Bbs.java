package bbs;

public class Bbs {

//	BbsID int PK
//	BbsTitle varchar(50)
//	userID varchar(20)
//	BbsDate datetime
//	BbsContent varchar(2048)
//	BbsAvailable int

	private int bbsID;
	private String bbsTitle;
	private String UserID;
	private String bbsDate;
	private String bbsContent;
	private int bbsAvailable;

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public int getBbsID() {
		return bbsID;
	}

	public void setBbsID(int BbsID) {
		this.bbsID = BbsID;
	}

	public String getBbsTitle() {
		return bbsTitle;
	}

	public void setBbsTitle(String BbsTitle) {
		this.bbsTitle = BbsTitle;
	}

	public String getBbsDate() {
		return bbsDate;
	}

	public void setBbsDate(String BbsDate) {
		this.bbsDate = BbsDate;
	}

	public String getBbsContent() {
		return bbsContent;
	}

	public void setBbsContent(String BbsContent) {
		this.bbsContent = BbsContent;
	}

	public int getBbsAvailable() {
		return bbsAvailable;
	}

	public void setBbsAvailable(int BbsAvailable) {
		this.bbsAvailable = BbsAvailable;
	}

}

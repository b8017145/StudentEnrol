package enrolsystem

class Student {

	String studentName;
	String studentID;
	Date dob;
	Boolean isFundingAvailable;
	String studentEmail;
	String studentUsername;
	String studentPassword;
	String course;
	
	
    static constraints = {

	studentName nullable: false
	studentName blank: false
	studentID nullable: false
	studentID blank: false
	dob nullable: false
	dob blank: false
	studentEmail nullable: false
	studentEmail blank: false
	studentEmail email: true
	studentUsername nullable: false
	studentUsername blank: false
	studentUsername unique:true
	studentPassword nullable: false
	studentPassword blank: false
	course nullable: false
	course blank: false
	
    }
}

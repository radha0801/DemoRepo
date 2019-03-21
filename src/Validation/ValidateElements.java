package Validation;

public class ValidateElements {

	public void validateName(String name) {
		if(name.matches("^[a-zA-Z]+(\\s[a-zA-Z]+)?$"));
		else {
			try {
				throw new Exception("Invalid Name");
			}catch(Exception e){
				e.printStackTrace();
				System.exit(0);
			}
		}
	}

	public void validateEmailId(String emailId) {
		if(emailId.endsWith("@infosys.com")||emailId.endsWith("@gmail.com")) {
			//System.out.println("Correct Email ID");
		}else {
			try {
				throw new Exception("Invalid emailId");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

	public void validateMobileNo(Long l1) {
		String s1 = l1.toString();
		// TODO Auto-generated method stub
		if(s1.matches("[7-9][0-9]{9}")) {
			//System.out.println("Corret mobile number");
		}else {
			try {
				throw new Exception("Invalid mobile no");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

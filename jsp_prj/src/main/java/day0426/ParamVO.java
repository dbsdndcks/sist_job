package day0426;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <jsp:useBean>액션으로 web parameter를 받기위한 VO
 * 규칙 : form control의 name속성의 값과 동일한 setter method로만 값이 입력된다.
 * 
 */
@Setter
@Getter
@ToString
public class ParamVO {
	private String  id,password2,name,birthday,tel,cell,issms,email,email1,email2,gender,area,zipcode,addr0,addr1;

	private String[] lunch;
}

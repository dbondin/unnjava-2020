package sample11;

public interface SomethingWithAgeAndGender extends SomethingWithAge {
	
	int GENDER_MALE = 1;
	int GENDER_FEMALE = 2;
	
	/* Please return GEWNDER_* here */
	int getGender();
}

/*
 File Name: SecondarySpec.java
 Name: Victor Duan
 Class: ICS4U1
 Date: November 10, 2013
 Description: An abstract class intended to be the parent of CondoSpec and HouseSpec
 				  The sole method is abstract, as CondoSpec and HouseSpec each have different ways to confirm whether specs match
*/

abstract class SecondarySpec {

	abstract boolean matchSpec(SecondarySpec other,	double percentage);
	
}
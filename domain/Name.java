package domain.valueObject;

public class FullName {
    private FirstName firstName;
    private LastName LastName;
    public FullName (FirstName firstName, LastName lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	if (!this.isValid()) {
	    throw new Exception();
	}
    }

    public boolean isValid() {
	return (firstName != null && lastName != null)
    }

    public String getName() {
	return firstName.getName() + lastName.getName();
    }
}

public class FirstName {
    final String name;
    public FirstName (String name) {
	this.name = name;
	if(!this.isValid()) {
	    throw new Exception();
	}
    }
    public String getName() {
	return name;
    }

    public boolean isValid() {
	return (this.name != null && this.name.length() >= 2 && this.name.length() < 30);
    }
}


public class LastName {
    final String name;
    public LastName (String name) {
	this.value = name;
	if(!this.isValid()) {
	    throw new Exception();
	}
    }
    public String getName() {
	return name;
    }

    public boolean isValid() {
	return (this.name != null && this.name.length() >= 2 && this.name.length() < 30);
    }
}

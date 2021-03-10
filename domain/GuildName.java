package domain.valueObject;

public class GuildName {
    final String name;
    public GuildName (String name) {
	this.name = name;
	if (!this.isValid()) {
	    throw new Exception();
	}
    }

    public boolean isValid() {
	return (this.name.length() >= 2 && this.name.length() <= 20);
    }
}

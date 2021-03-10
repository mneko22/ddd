package domain.entity;

public class Guild {
    final Object[] members;
    final GuildNmae name;
    public Guild (GuildName name) {
	this.members = new Object[];
	this.name = name;
    }
}

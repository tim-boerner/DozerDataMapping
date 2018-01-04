package dto.mods;

public class Name {
    private String namePart;
    private Role role;

    /**
     * Gets namePart.
     *
     * @return The namePart.
     */
    public String getNamePart() {
        return namePart;
    }

    /**
     * Sets namePart.
     *
     * @param namePart The namePart.
     */
    public void setNamePart(String namePart) {
        this.namePart = namePart;
    }

    /**
     * Gets role.
     *
     * @return The role.
     */
    public Role getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role The role.
     */
    public void setRole(Role role) {
        this.role = role;
    }
}

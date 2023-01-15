public class Children {

    private Profession profession;

    String name;

    public Children(Profession profession, String name) {
        this.profession = profession;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        Children that = (Children) obj;

        if(this.hashCode() == that.hashCode()) {
            return true;
        } else
            return false;

    }

    @Override
    public int hashCode(){
        return profession.ordinal() + 11 * name.hashCode();
    }

}

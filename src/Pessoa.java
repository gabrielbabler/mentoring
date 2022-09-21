public class Pessoa {

    private String name;
    private Integer age;
    private Integer cpf;
    private Gender gender;

    public Pessoa(final String name, final Integer age, final Integer cpf, final Gender gender) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(final Integer cpf) {
        this.cpf = cpf;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(final Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cpf=" + cpf +
                ", gender=" + gender +
                '}';
    }
}

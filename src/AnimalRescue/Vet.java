package AnimalRescue;

public class Vet extends MedicalStaff {

    @Override
    public void expertness() {
        System.out.println("The main role of the vet is Surgical operations");
    }
    //Cum as putea sa folosesc "expertness" de mai multe ori in aceeasi clasa? Care este solutia?
    // Pentru clasa Vet am vrut sa scriu mai multe tipuri de specializari care sa fie folosite ca override in clasa main atunci cand
    // definesc obiectele pentru clasa vet.. nu am reusit, daca imi poti spune solutia daca este posibil..

  /*  public void expertness() {
        System.out.println("Dentist");
    }*/

}

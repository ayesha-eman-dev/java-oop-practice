public class Company
{

    String companyName;
    CityCinema []branches;

    public Company(String companyName, int branchCount) {

        this.companyName = companyName;

        branches = new CityCinema[branchCount];

        for (int i = 0; i < branches.length; i++) {

            branches[i] = new CityCinema(
                    " Branch " + (i + 1),2,
                    " Main Road",
                    " Lahore"
            );
        }
    }

    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("Company: ").append(companyName).append("\n");
        s.append("\n");
        for (CityCinema branch : branches) {

            s.append(branch).append("\n");
        }

        return s.toString();
    }
}
class GovernmentSystem {

    static class SecurityService {

        public static void verifyAccess(String department) {
            System.out.println(
                    "Access verified for " + department
            );
        }
    }

    static class TaxService {

        public static void collectTax() {

            SecurityService.verifyAccess("Tax Department");

            System.out.println(
                    "Tax collection service is running."
            );
        }
    }

    static class IdentityService {

        public static void manageNationalID() {

            SecurityService.verifyAccess(
                    "National Identification Department"
            );

            System.out.println(
                    "National ID management service is running."
            );
        }
    }



    static class PassportService {

        public static void processPassport() {

            SecurityService.verifyAccess(
                    "Passport Department"
            );

            System.out.println(
                    "Passport processing service is running."
            );
        }
    }



    static class BusinessService {

        public static void registerBusiness() {

            SecurityService.verifyAccess(
                    "Business Registration Department"
            );

            System.out.println(
                    "Business registration service is running."
            );
        }
    }



    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("   UGANDA GOVERNMENT SYSTEM");
        System.out.println("================================");

        System.out.println();


        TaxService.collectTax();

        System.out.println();

        IdentityService.manageNationalID();

        System.out.println();


        PassportService.processPassport();

        System.out.println();


        BusinessService.registerBusiness();

        System.out.println();
        System.out.println("All government services completed.");
    }
}
public class Controller {
    public static void main(String[] args){
        NamesRepository namesRepository = new NamesRepository();

        namesRepository.addName("ahmad");
        namesRepository.addName("mohammad");
        namesRepository.addName("ali");
        namesRepository.addName("mustafa");

        for (Iterator iterator = namesRepository.getIterator(); iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println("Name is: "+name);
        }
    }
}

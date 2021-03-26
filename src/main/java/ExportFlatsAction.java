public class ExportFlatsAction {

    private FlatRepository flatRepository;

    public ExportFlatsAction(FlatRepository flatRepository) {
        this.flatRepository = flatRepository;
    }

    public void execute() {
        flatRepository.all().stream().forEach((f) -> {
            System.out.println(f.id + " " + f.name + " " + f.description + " " + f.price);
        });
    }
}

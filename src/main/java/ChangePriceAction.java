public class ChangePriceAction {

    private FlatRepository flatRepository;

    public ChangePriceAction(FlatRepository flatRepository) {
        this.flatRepository = flatRepository;
    }

    public void execute(String flatid, int newPrice) {
        Flat flat = flatRepository.get(flatid);
        flat.price = newPrice;
        flatRepository.save(flat);
    }
}

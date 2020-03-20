package cli.commands;

import api.DDPublicAPI;
import cli.framework.Command;

import java.util.List;

public class PlanDelivery extends Command<DDPublicAPI> {

    private int calendar;
    private int idPackage;

    @Override
    public String identifier() { return "plan"; }

    @Override
    public void load(List<String> args) {
        calendar = Integer.parseInt(args.get(0));
        idPackage = Integer.parseInt(args.get(1));
    }

    @Override
    public void execute() throws Exception {
        String response = system.deliveries.planDelivery(calendar, idPackage);
        System.out.println(response);
    }

    @Override
    public String describe() {
        return "Plan the delivery of a package to a given date (plan DATE PACKAGE_ID)";
    }
}

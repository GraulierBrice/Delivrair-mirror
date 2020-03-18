namespace CLI
{
    [CommandInfo("drones", "Lists all drones and their status")]
    internal class CommandListDrones : Command
    {
        HTTPService http = new HTTPService();

        internal override string Run()
        {
            return http.SendRequest("parcels/by_id/1");
        }
    }
}
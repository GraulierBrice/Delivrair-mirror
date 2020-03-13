namespace CLI
{
    [CommandInfo("quit", "Exits the command line interpreter")]
    internal class CommandQuit : Command
    {
        internal override string Run()
        {
            System.Environment.Exit(0);
            return "";
        }
    }
}
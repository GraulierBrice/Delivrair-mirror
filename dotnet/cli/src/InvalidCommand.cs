namespace CLI
{
    internal class InvalidCommand : Command
    {
        internal readonly string InvalidName;
        internal readonly string[] InvalidArgs;
        
        internal InvalidCommand(string name, string[] args)
        {
            this.InvalidName = name;
            this.InvalidArgs = args;
        }

        internal override string Run() {
            return string.Format("Unknown command: {0}", InvalidName);
        }
    }
}
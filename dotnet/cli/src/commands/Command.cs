namespace CLI
{
    internal abstract class Command
    {
        internal string[] Arguments { get; private set; }

        internal void PassArguments(string[] args) {
            this.Arguments = args;
        }

        internal abstract string Run();

        internal Command() {}
    }
}
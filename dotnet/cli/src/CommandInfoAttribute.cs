namespace CLI
{
    [System.AttributeUsage(System.AttributeTargets.Class, Inherited = false, AllowMultiple = true)]
    sealed class CommandInfoAttribute : System.Attribute
    {
        internal CommandInfoAttribute(string name, string description) {
            this.Name = name;
            this.Description = description;
        }

        internal CommandInfoAttribute(string name, string description, string arguments) {
            this.Name = name;
            this.Description = description;
            this.Arguments = arguments;
        }

        internal readonly string Name;
        internal readonly string Description;
        internal readonly string Arguments;
    }
}
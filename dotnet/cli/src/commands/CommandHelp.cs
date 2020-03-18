using System.Reflection;
using System.Linq;
using System;

namespace CLI
{
    [CommandInfo("help", "Display this message", "command")]
    internal class CommandHelp : Command
    {
        internal override string Run()
        {
            string message = "Available commands:";
            foreach (CommandInfoAttribute infos in Utils.FindAllCommandInfos()) {
                message += System.Environment.NewLine;
                message += string.Format("{0}   {1}", infos.Name, infos.Description);
            }
            return message;
        }
    }
}
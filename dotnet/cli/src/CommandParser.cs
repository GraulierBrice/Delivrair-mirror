using System;
using System.Linq;

namespace CLI
{
    internal class CommandParser {
        
        struct CommandInput {
            internal string CommandName;
            internal string[] CommandArgs;
        }

        private CommandInput ExtractArgs(string commandLine) {
            string[] allArgs =commandLine.Split(' ', '\t');
            return new CommandInput {
                CommandName = allArgs[0],
                CommandArgs = allArgs.Skip(1).ToArray()
            };
        }
        
        internal Command Parse(string commandLine) {
            CommandInput args = ExtractArgs(commandLine);
            Command command;
            try {
                Type t = Utils.GetCommandTypeFromName(args.CommandName);
                command = (Command) (t.GetConstructor(new Type[] {}).Invoke(new object[] {}));
                command.PassArguments(args.CommandArgs);
            } catch {
                command = new InvalidCommand(args.CommandName, args.CommandArgs);
            }
            return command;
        }
    }
}
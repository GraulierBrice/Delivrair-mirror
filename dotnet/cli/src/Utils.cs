using System;
using System.Reflection;
using System.Linq;

namespace CLI
{
    internal class Utils
    {
        internal static Type[] FindAllCommandTypes() {
            Assembly assembly = typeof(Interpreter).Assembly;
            Type[] types = assembly.GetTypes();
            return types
                .Where(t => t.BaseType == typeof(Command))
                .ToArray();
        }

        internal static CommandInfoAttribute[] FindAllCommandInfos() {
            Assembly assembly = typeof(Interpreter).Assembly;
            return FindAllCommandTypes()
                .Select(t => t.GetCustomAttribute<CommandInfoAttribute>())
                .Where(attr => attr != null)
                .ToArray();
        }

        internal static CommandInfoAttribute GetCommandInfo<T>() where T : Command {
            return typeof(T).GetCustomAttribute<CommandInfoAttribute>();
        }

        internal static CommandInfoAttribute GetCommandInfo(Type T) {
            return T.GetCustomAttribute<CommandInfoAttribute>();
        }

        internal static Type GetCommandTypeFromName(string commandName) {
            return FindAllCommandTypes()
                .Where(T => GetCommandInfo(T) != null && GetCommandInfo(T).Name.Equals(commandName))
                .First();
        }
    }
}
using System;

namespace CLI
{
    public class Interpreter
    {

        CommandParser parser = new CommandParser();

        private void ShowMessage(string message)
        {
            Console.WriteLine(message);
        }

        private void ShowPrompt()
        {
            Console.Write("> ");
        }

        private string ReadCommand()
        {
            return Console.ReadLine();
        }

        private void Loop() {
            string commandLine = ReadCommand();
            try {
                Command command = parser.Parse(commandLine);
                string message = command.Run();
                ShowMessage(message);
            } catch (Exception e) {
                ShowMessage("Oops something went wrong...");
                ShowMessage(e.Message);
            } finally {
                ShowPrompt();
            }
        }

        public void Start()
        {
            ShowMessage("Hello and welcome !");
            ShowMessage("Type 'help' to get a list of all commands");
            ShowPrompt();

            while (true)
            {
                Loop();
            }
        }

    }
}
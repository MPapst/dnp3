﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Automatak.Simulator.UI
{
    static class LogFormatter
    {
        private static string timeFormat = "HH:mm:ss.fff";
        private static string logFormat = "  {0,-16}{1,-10}{2,-10}{3}";

        public static string GetLogString(string filters, string alias, string message)
        {
            return String.Format(logFormat, DateTime.Now.ToString(timeFormat), filters, alias, message);
        }

        public static string GetBareString(string message)
        {
            return String.Format("  {0}{1}", new String(' ', 36), message);
        }
    }

}

﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System.Drawing;

namespace Automatak.Simulator.UI
{
    public enum DisplayHint
    { 
        EVENT,
        ERROR,
        WARNING,
        INFO,
        ALT1,
        ALT2,
        ALT3,
    };

    public interface ILog
    {
        void Log(DisplayHint hint, string message);

        void LogFull(DisplayHint hint, string filter, string alias, string message);
    }
    
}

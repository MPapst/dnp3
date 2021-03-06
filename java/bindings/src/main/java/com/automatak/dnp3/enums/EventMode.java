//
//  _   _         ______    _ _ _   _             _ _ _
// | \ | |       |  ____|  | (_) | (_)           | | | |
// |  \| | ___   | |__   __| |_| |_ _ _ __   __ _| | | |
// | . ` |/ _ \  |  __| / _` | | __| | '_ \ / _` | | | |
// | |\  | (_) | | |___| (_| | | |_| | | | | (_| |_|_|_|
// |_| \_|\___/  |______\__,_|_|\__|_|_| |_|\__, (_|_|_)
//                                           __/ |
//                                          |___/
// 
// This file is auto-generated. Do not edit manually
// 
// Copyright 2013 Automatak LLC
// 
// Automatak LLC (www.automatak.com) licenses this file
// to you under the the Apache License Version 2.0 (the "License"):
// 
// http://www.apache.org/licenses/LICENSE-2.0.html
//

package com.automatak.dnp3.enums;
/**
* Describes how a transaction behaves with respect to event generation
*/
public enum EventMode
{
  /**
  * Detect events using the specific mechanism for that type
  */
  Detect(0x0),
  /**
  * Force the creation of an event bypassing detection mechanism
  */
  Force(0x1),
  /**
  * Never produce an event regardless of changes
  */
  Suppress(0x2),
  /**
  * Send an event directly to the event buffer, bypassing the static value completely
  */
  EventOnly(0x3);

  private final int id;

  public int toType()
  {
    return id;
  }

  EventMode(int id)
  {
    this.id = id;
  }

  public static EventMode fromType(int arg)
  {
    switch(arg)
    {
      case(0x0):
        return Detect;
      case(0x1):
        return Force;
      case(0x2):
        return Suppress;
      case(0x3):
        return EventOnly;
      default:
        return Detect;
    }
  }
}

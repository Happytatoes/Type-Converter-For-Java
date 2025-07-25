# Java Data Type Conversions

A Java library that covers six core conversion functions between primitive types and strings/booleans. Designed for early practice with Java syntax and method design.

## 🎯 Purpose
Understand type casting, parsing, and conversion between common Java types.

## 🔧 Conversions Supported
- `int` ↔ `String`
- `boolean` ↔ `String`
- `String` → `double`
- `double` → `String`
- `int` → `boolean` (e.g., 0 = false, other = true)
- `boolean` → `int` (true = 1, false = 0)

## 🛠️ Tech
- Java 11+
- CLI or unit tests for verification

## 🧪 Sample Methods

Conversions.intToString(42);         // returns "42"
Conversions.stringToBoolean("true"); // returns true
Conversions.booleanToInt(false);     // returns 0

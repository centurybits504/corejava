<br>
String is a class in java.lan package.<br>
In java all classes are considered as datatypes.so we can consider String as a datatypes also.<br>
Because a class is also called as datatype.<br>
<br>
There are 2 ways to create Strings in java.<br>
1) String str = \"Hello\"; //by string literal<br>
2) String str = new String(\"Hello\"); //by new keyword<br>
<br>
String objects are stored in the special memory called String Constant Pool,
where  new object are not created if object already exist in the String Constant Pool.<br>
This helps in memory management of java.<br>
<br>

<font color=\'#0091EA\'><b>Difference Between String str =\"Hello\";	 and String str = new String(\"Hello\"); ?</b></font><br>
In  String str =\"Hello\"; - assignment operator is used to assigh the string literal to the string variable str.<br>
JVM first check whether the same object is already available in the String Constant Pool.<br>
If the object is available in the String Constant Pool, then jvm creates reference to it.<br>
If the object is not available in the String Constant Pool, then jvm creates new object with the content \"Hello\".<br>
<br>
In String str = new String(\"Hello\");  -  new  keyword is used to create the String object.<br>
In this case JVM  always creates a new object without checking in the String Constant Pool.<br>
<br><br>

String objects are immutable objects whose objects cannot be modified.<br>
<font color=\'#0091EA\'><b>Methods of String Class:</b></font><br><br>
<font color=\'#0091EA\'><b>char charAt(int index):</b></font>	It returns char value for the particular index<br><br>
<font color=\'#0091EA\'><b>static String format(String format, Object... args):</b></font>	It returns formatted string<br><br>
<font color=\'#0091EA\'><b>static String format(Locale l, String format, Object... args):</b></font> It returns formatted string with given locale<br><br>
<font color=\'#0091EA\'><b>static String join(CharSequence delimiter, CharSequence... elements):</b></font>	It returns a joined string<br><br>
<font color=\'#0091EA\'><b>String substring(int beginIndex):</b></font>	 It returns substring for given begin index<br><br>
<font color=\'#0091EA\'><b>String substring(int beginIndex, int endIndex):</b></font>	It returns substring for given begin index and end index<br><br>
<font color=\'#0091EA\'><b>String concat(String str):</b></font>	It concatinates specified string<br><br>
<font color=\'#0091EA\'><b>String replace(char old, char new):</b></font>	It replaces all occurrences of specified char value<br><br>
<font color=\'#0091EA\'><b>String replace(CharSequence old, CharSequence new):</b></font>	It replaces all occurrences of specified CharSequence<br><br>
<font color=\'#0091EA\'><b>String trim():</b></font>	It returns trimmed string omitting leading and trailing spaces<br><br>
<font color=\'#0091EA\'><b>String split(String regex):</b></font>	It returns splitted string matching regex<br><br>
<font color=\'#0091EA\'><b>String split(String regex, int limit):</b></font>	It returns splitted string matching regex and limit<br><br>
<font color=\'#0091EA\'><b>String intern():</b></font>	It returns interned string<br><br>
<font color=\'#0091EA\'><b>String toLowerCase():</b></font>	It returns string in lowercase<br><br>
<font color=\'#0091EA\'><b>String toLowerCase(Locale locale):</b></font>	It returns string in lowercase using specified locale<br><br>
<font color=\'#0091EA\'><b>String toUpperCase():</b></font>	It returns string in uppercase<br><br>
<font color=\'#0091EA\'><b>String toUpperCase(Locale locale):</b></font>	It returns string in uppercase using specified locale<br><br>
<font color=\'#0091EA\'><b>boolean contains(CharSequence s):</b></font>	It returns true or false after matching the sequence of char value<br><br>
<font color=\'#0091EA\'><b>boolean equals(Object another):</b></font>	It checks the equality of string with object<br><br>
<font color=\'#0091EA\'><b>boolean isEmpty():</b></font>	It checks if string is empty<br><br>
<font color=\'#0091EA\'><b>int length():</b></font>	It returns string length<br><br>
<font color=\'#0091EA\'><b>int indexOf(int ch):</b></font>	It returns specified char value index<br><br>
<font color=\'#0091EA\'><b>int indexOf(int ch, int fromIndex):</b></font>	It returns specified char value index starting with given index<br><br>
<font color=\'#0091EA\'><b>int indexOf(String substring):</b></font>	It returns specified substring index<br><br>
<font color=\'#0091EA\'><b>int indexOf(String substring, int fromIndex):</b></font>	It returns specified substring index starting with given index<br><br>
<font color=\'#0091EA\'><b>static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements):</b></font>	It returns a joined string.<br><br>

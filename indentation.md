# A guide for indentation
There is a large debate in the programming community about how things should be indented, but there is a simple solution.

## **TABS**
A part of the original ASCII character set (character code `9` in ASCII, `U+0009` in unicode), originiating from the days of typewriters and still existing to this day, the simple horizontal tab is a character which was created with only one purpose - indentation.

By standardizing on tabs, a few problems are solved.
 1. In most editors, the width of the tab can be set, so all developers can have their preferred indentation width across every project they work on.
 2. Since there is only one character per indentation level and that character is only ever used for indentation, it is easy to highlight indentation levels, and the tab key only ever has to insert one character, eliminating the need for systems that detect how many spaces to insert.
 3. In languages such as Python where indentation affects the function of the code, tabs help prevent problems from occuring due to incorrect indentation.

## The issues with tabs
The only two main issues with tabs are because some people didn't consider some use cases, or were just lazy.

### **Issue #1**
Some editors do not support variable tab widths. This can be an issue with languages only supported with these editors, but it is a non-issue for most of the community. For the people who use editors that do not support variable tab widths, still try to use tabs, because standards are better not fully supported than ignored.

Also, some editors only support using spaces for indentation, and will insert spaces even when you press the `TAB` key, but in most cases the editor can be patched to fix this or a different editor can be used.

### **Issue #2 *(The big one)*:**
Because people don't always use tabs (even though they should), some interpreters do not support them (I recently ran into this with Home Assistant's YAML interpreter, for example). This could be fixed by things just supporting tabs, so if you ever run into things that don't support tabs and are able to fix them, do.

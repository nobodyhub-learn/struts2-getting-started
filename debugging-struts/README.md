# Trouble Shooting

## Page no response after adding `debug=browser` in URL

When adding `debug` parameter in the URL, it is supposed to print debug information of value stack.
According to the [page](https://struts.apache.org/getting-started/debugging-struts.html), we need the `Struts 2 dojo plugin` to function.

### Solution
According to [Struts 2.3 to 2.5 migration](https://cwiki.apache.org/confluence/display/WW/Struts+2.3+to+2.5+migration),
`Dojo Plugin` is not supported any more, as it is stated:

> Remove the following plugin dependencies because they were dropped and aren't supported anymore.
>  
> * Dojo Plugin
> * Codebehind Plugin
> * JSF Plugin
> * Struts1 Plugin


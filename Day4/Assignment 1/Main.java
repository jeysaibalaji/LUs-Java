<html>
<head>
<title>Main.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cc7832;}
.s1 { color: #a9b7c6;}
.s2 { color: #808080;}
.s3 { color: #6897bb;}
.ln { color: #606366; font-weight: normal; font-style: normal; }
</style>
</head>
<body bgcolor="#2b2b2b">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Main.java</font>
</center></td></tr></table>
<pre><a name="l1"><span class="ln">1    </span></a><span class="s0">package </span><span class="s1">com.company</span><span class="s0">;</span>
<a name="l2"><span class="ln">2    </span></a><span class="s0">import </span><span class="s1">java.util.Scanner</span><span class="s0">;</span>
<a name="l3"><span class="ln">3    </span></a>
<a name="l4"><span class="ln">4    </span></a>
<a name="l5"><span class="ln">5    </span></a><span class="s0">public class </span><span class="s1">Main {</span>
<a name="l6"><span class="ln">6    </span></a>
<a name="l7"><span class="ln">7    </span></a>    <span class="s0">public static void </span><span class="s1">main(String[] args) {</span>
<a name="l8"><span class="ln">8    </span></a>
<a name="l9"><span class="ln">9    </span></a>	<span class="s2">// write your code here</span>
<a name="l10"><span class="ln">10   </span></a>        <span class="s1">Avengers[] avenger = </span><span class="s0">new </span><span class="s1">Avengers[</span><span class="s3">5</span><span class="s1">]</span><span class="s0">;</span>
<a name="l11"><span class="ln">11   </span></a>
<a name="l12"><span class="ln">12   </span></a>        <span class="s0">for </span><span class="s1">(</span><span class="s0">int </span><span class="s1">i=</span><span class="s3">0</span><span class="s0">;</span><span class="s1">i&lt;</span><span class="s3">5</span><span class="s0">;</span><span class="s1">i++)</span>
<a name="l13"><span class="ln">13   </span></a>        <span class="s1">{</span>
<a name="l14"><span class="ln">14   </span></a>            <span class="s1">avenger[i] = </span><span class="s0">new </span><span class="s1">Avengers()</span><span class="s0">;</span>
<a name="l15"><span class="ln">15   </span></a>            <span class="s1">avenger[i].getDetails()</span><span class="s0">;</span>
<a name="l16"><span class="ln">16   </span></a>            <span class="s1">avenger[i].displayDetails()</span><span class="s0">;</span>
<a name="l17"><span class="ln">17   </span></a>        <span class="s1">}</span>
<a name="l18"><span class="ln">18   </span></a>    <span class="s1">}</span>
<a name="l19"><span class="ln">19   </span></a><span class="s1">}</span>
<a name="l20"><span class="ln">20   </span></a></pre>
</body>
</html>
<html>
<head>
<title>Avengers.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cc7832;}
.s1 { color: #a9b7c6;}
.s2 { color: #6a8759;}
.ln { color: #606366; font-weight: normal; font-style: normal; }
</style>
</head>
<body bgcolor="#2b2b2b">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Avengers.java</font>
</center></td></tr></table>
<pre><a name="l1"><span class="ln">1    </span></a><span class="s0">package </span><span class="s1">com.company</span><span class="s0">;</span>
<a name="l2"><span class="ln">2    </span></a>
<a name="l3"><span class="ln">3    </span></a><span class="s0">import </span><span class="s1">java.util.Scanner</span><span class="s0">;</span>
<a name="l4"><span class="ln">4    </span></a>
<a name="l5"><span class="ln">5    </span></a><span class="s0">public class </span><span class="s1">Avengers {</span>
<a name="l6"><span class="ln">6    </span></a>    <span class="s1">Scanner sc=</span><span class="s0">new </span><span class="s1">Scanner(System.in)</span><span class="s0">;</span>
<a name="l7"><span class="ln">7    </span></a>    <span class="s1">String Name</span><span class="s0">,</span><span class="s1">Power</span><span class="s0">,</span><span class="s1">Weapon</span><span class="s0">,</span><span class="s1">Planet</span><span class="s0">;</span>
<a name="l8"><span class="ln">8    </span></a>    <span class="s0">int </span><span class="s1">age</span><span class="s0">;</span>
<a name="l9"><span class="ln">9    </span></a>
<a name="l10"><span class="ln">10   </span></a>
<a name="l11"><span class="ln">11   </span></a>    <span class="s0">public void </span><span class="s1">getDetails(){</span>
<a name="l12"><span class="ln">12   </span></a>        <span class="s1">System.out.println(</span><span class="s2">&quot;Enter the name of Avenger&quot;</span><span class="s1">)</span><span class="s0">;</span>
<a name="l13"><span class="ln">13   </span></a>        <span class="s1">Name=sc.nextLine()</span><span class="s0">;</span>
<a name="l14"><span class="ln">14   </span></a>        <span class="s1">System.out.println(</span><span class="s2">&quot;enter th Age of avenger&quot;</span><span class="s1">)</span><span class="s0">;</span>
<a name="l15"><span class="ln">15   </span></a>        <span class="s1">age = sc.nextInt()</span><span class="s0">;</span>
<a name="l16"><span class="ln">16   </span></a>        <span class="s1">System.out.println(</span><span class="s2">&quot;enter th Power of avenger&quot;</span><span class="s1">)</span><span class="s0">;</span>
<a name="l17"><span class="ln">17   </span></a>        <span class="s1">Power=sc.nextLine()</span><span class="s0">;</span>
<a name="l18"><span class="ln">18   </span></a>        <span class="s1">System.out.println(</span><span class="s2">&quot;enter th Weapon of avenger&quot;</span><span class="s1">)</span><span class="s0">;</span>
<a name="l19"><span class="ln">19   </span></a>        <span class="s1">Weapon=sc.nextLine()</span><span class="s0">;</span>
<a name="l20"><span class="ln">20   </span></a>        <span class="s1">System.out.println(</span><span class="s2">&quot;enter th Planet of avenger&quot;</span><span class="s1">)</span><span class="s0">;</span>
<a name="l21"><span class="ln">21   </span></a>        <span class="s1">Planet=sc.nextLine()</span><span class="s0">;</span>
<a name="l22"><span class="ln">22   </span></a>    <span class="s1">}</span>
<a name="l23"><span class="ln">23   </span></a>
<a name="l24"><span class="ln">24   </span></a>
<a name="l25"><span class="ln">25   </span></a>    <span class="s0">public void </span><span class="s1">displayDetails(){</span>
<a name="l26"><span class="ln">26   </span></a>        <span class="s1">System.out.println(</span><span class="s2">&quot;Enter the name of Avenger =&quot; </span><span class="s1">+Name)</span><span class="s0">;</span>
<a name="l27"><span class="ln">27   </span></a>        <span class="s1">System.out.println(</span><span class="s2">&quot;enter th Age of avenger =&quot; </span><span class="s1">+age)</span><span class="s0">;</span>
<a name="l28"><span class="ln">28   </span></a>        <span class="s1">System.out.println(</span><span class="s2">&quot;enter th Power of avenger =&quot;</span><span class="s1">+Power)</span><span class="s0">;</span>
<a name="l29"><span class="ln">29   </span></a>        <span class="s1">System.out.println(</span><span class="s2">&quot;enter th Weapon of avenger =&quot;</span><span class="s1">+Weapon)</span><span class="s0">;</span>
<a name="l30"><span class="ln">30   </span></a>        <span class="s1">System.out.println(</span><span class="s2">&quot;enter th Planet of avenger =&quot;</span><span class="s1">+Planet)</span><span class="s0">;</span>
<a name="l31"><span class="ln">31   </span></a>    <span class="s1">}</span>
<a name="l32"><span class="ln">32   </span></a>
<a name="l33"><span class="ln">33   </span></a>
<a name="l34"><span class="ln">34   </span></a>
<a name="l35"><span class="ln">35   </span></a>
<a name="l36"><span class="ln">36   </span></a>
<a name="l37"><span class="ln">37   </span></a><span class="s1">}</span>
<a name="l38"><span class="ln">38   </span></a></pre>
</body>
</html>
package clojure;

import clojure.lang.*;

public final class string_replace_first_by extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "re-matcher");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "re-groups");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public string_replace_first_by() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object re2, java.lang.Object f3) {
  {
   Object m4 = ((IFn)const__0.getRawRoot()).invoke(re2, s1);
   if (((java.util.regex.Matcher)m4).find()) {
    {
     Object buffer5 = new java.lang.StringBuffer((int)((java.lang.CharSequence)s1).length());
     Object rep6 = ((java.lang.String)java.util.regex.Matcher.quoteReplacement((java.lang.String)((java.lang.String)((IFn)f3).invoke(((IFn)const__1.getRawRoot()).invoke(m4)))));
     ((java.util.regex.Matcher)m4).appendReplacement((java.lang.StringBuffer)((java.lang.StringBuffer)buffer5), (java.lang.String)((java.lang.String)rep6));
     ((java.util.regex.Matcher)m4).appendTail((java.lang.StringBuffer)((java.lang.StringBuffer)buffer5));
     return ((IFn)const__2.getRawRoot()).invoke(buffer5);
    }
   } else {
    return s1;
   }
  }
 }
}

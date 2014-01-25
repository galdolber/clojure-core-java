package clojure;

import clojure.lang.*;

public final class string_replace extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.lang.Character.class;
  const__2 = (java.lang.Object)java.lang.CharSequence.class;
  const__3 = (java.lang.Object)java.util.regex.Pattern.class;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "re-matcher");
  const__5 = (clojure.lang.Var)RT.var("clojure.string", "replace-by");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public string_replace() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object match2, java.lang.Object replacement3) {
  {
   Object s4 = ((java.lang.String)((java.lang.Object)s1).toString());
   if ((match2 instanceof java.lang.Character)) {
    return ((java.lang.String)((java.lang.String)s4).replace((char)((Character)match2).charValue(), (char)((Character)replacement3).charValue()));
   } else {
    if ((match2 instanceof java.lang.CharSequence)) {
     return ((java.lang.String)((java.lang.String)s4).replace((java.lang.CharSequence)((java.lang.CharSequence)match2), (java.lang.CharSequence)((java.lang.CharSequence)replacement3)));
    } else {
     if ((match2 instanceof java.util.regex.Pattern)) {
      if ((replacement3 instanceof java.lang.CharSequence)) {
       return ((java.lang.String)((java.util.regex.Matcher)((IFn)const__4.getRawRoot()).invoke(match2, s4)).replaceAll((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.Object)replacement3).toString()))));
      } else {
       return ((IFn)const__5.getRawRoot()).invoke(s4, match2, replacement3);
      }
     } else {
      Object __r6322 = const__6;
      if (__r6322 != null && !(__r6322 == Boolean.FALSE)) {
       Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__7.getRawRoot()).invoke("Invalid match arg: ", match2))));
       return null;
      } else {
       return null;
      }
     }
    }
   }
  }
 }
}

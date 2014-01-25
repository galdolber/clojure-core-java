package clojure;

import clojure.lang.*;

public final class string_split_lines extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.string", "split");
  const__1 = (java.lang.Object)java.util.regex.Pattern.compile("\\r?\\n");
 }
 public string_split_lines() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((IFn)const__0.getRawRoot()).invoke(s1, const__1);
 }
}

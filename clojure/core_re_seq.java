package clojure;

import clojure.lang.*;

public final class core_re_seq extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "re-matcher");
 }
 public core_re_seq() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object re1, java.lang.Object s2) {
  {
   Object m3 = ((IFn)const__0.getRawRoot()).invoke(re1, s2);
   return ((IFn)new clojure.core_re_seq_step__4665(m3)).invoke();
  }
 }
}

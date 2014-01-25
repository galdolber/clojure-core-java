package clojure;

import clojure.lang.*;

public final class core_re_seq_step__4665 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "re-groups");
 }
 Object m3;
 public core_re_seq_step__4665(final Object m3) {
  super();
  this.m3 = m3;
 }
 public java.lang.Object invoke() {
  if (((java.util.regex.Matcher)this.m3).find()) {
   return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.m3), new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_re_seq_step__4665_fn__4666(this))));
  } else {
   return null;
  }
 }
}

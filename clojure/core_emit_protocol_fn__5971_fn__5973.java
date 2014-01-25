package clojure;

import clojure.lang.*;

public final class core_emit_protocol_fn__5971_fn__5973 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 Object s2;
 public core_emit_protocol_fn__5971_fn__5973(final Object s2) {
  super();
  this.s2 = s2;
 }
 public java.lang.Object invoke() {
  {
   Object as1 = clojure.lang.PersistentVector.EMPTY;
   Object rs2 = ((IFn)const__0.getRawRoot()).invoke(this.s2);
   while(true) {
    Object __r3808 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(rs2));
    if (__r3808 != null && !(__r3808 == Boolean.FALSE)) {
     java.lang.Object as1___aux = ((IFn)const__3.getRawRoot()).invoke(as1, ((IFn)const__2.getRawRoot()).invoke(rs2));
     java.lang.Object rs2___aux = ((IFn)const__4.getRawRoot()).invoke(rs2);
     as1 = as1___aux;
     rs2 = rs2___aux;
     continue;
    } else {
     return RT.vector(((IFn)const__5.getRawRoot()).invoke(as1), ((IFn)const__2.getRawRoot()).invoke(rs2));
    }
   }
  }
 }
}

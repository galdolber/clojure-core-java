package clojure.core;

import clojure.lang.*;

public final class reducers_foldvec_fn__6753 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjtask");
  const__1 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjfork");
  const__2 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjjoin");
 }
 Object v16;
 Object fc8;
 Object combinef3;
 Object v27;
 public reducers_foldvec_fn__6753(final Object v16, final Object fc8, final Object combinef3, final Object v27) {
  super();
  this.v16 = v16;
  this.fc8 = fc8;
  this.combinef3 = combinef3;
  this.v27 = v27;
 }
 public java.lang.Object invoke() {
  {
   Object f11 = ((IFn)this.fc8).invoke(this.v16);
   Object t22 = ((IFn)const__0.getRawRoot()).invoke(((IFn)this.fc8).invoke(this.v27));
   ((IFn)const__1.getRawRoot()).invoke(t22);
   return ((IFn)this.combinef3).invoke(((IFn)f11).invoke(), ((IFn)const__2.getRawRoot()).invoke(t22));
  }
 }
}

package clojure.core;

import clojure.lang.*;

public final class reducers_fn__6643_G__6638__6654 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "-cache-protocol-fn");
  const__1 = (java.lang.Object)clojure.core.reducers.CollFold.class;
 }
 Object G__66392;
 public reducers_fn__6643_G__6638__6654(final Object G__66392) {
  super();
  this.G__66392 = G__66392;
 }
 public java.lang.Object invoke(java.lang.Object gf__coll__66501, java.lang.Object gf__n__66512, java.lang.Object gf__combinef__66523, java.lang.Object gf__reducef__66534) {
  {
   Object cache__5922__auto__5 = ((clojure.lang.MethodImplCache)((clojure.lang.AFunction)this).__methodImplCache);
   Object f__5923__auto__6 = ((clojure.lang.IFn)((clojure.lang.MethodImplCache)cache__5922__auto__5).fnFor((java.lang.Class)((java.lang.Class)((java.lang.Class)clojure.lang.Util.classOf(((java.lang.Object)gf__coll__66501))))));
   Object __r4375 = f__5923__auto__6;
   if (__r4375 != null && !(__r4375 == Boolean.FALSE)) {
    return ((IFn)f__5923__auto__6).invoke(gf__coll__66501, gf__n__66512, gf__combinef__66523, gf__reducef__66534);
   } else {
    return ((IFn)((IFn)const__0.getRawRoot()).invoke(this, gf__coll__66501, const__1, this.G__66392)).invoke(gf__coll__66501, gf__n__66512, gf__combinef__66523, gf__reducef__66534);
   }
  }
 }
}

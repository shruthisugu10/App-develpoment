import React from 'react';
import ReactDOM from 'react-dom/client';

import App from './App';
import { PersistGate } from 'redux-persist/integration/react';
import { Provider } from 'react-redux';
import { persistor, store } from './component/redux/store';
import { BrowserRouter as Router } from 'react-router-dom';

const root = ReactDOM.createRoot(
    document.getElementById('root'));
root.render(
    <React.StrictMode>
         <Provider store={store}>
            <PersistGate loading={null} persistor={persistor}>
                        <Router>
                            <App/>
                        </Router>
            </PersistGate>
         </Provider>
    </React.StrictMode>
   
);
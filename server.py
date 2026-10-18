import http.server
import socketserver
import threading
import os

class NoCacheHTTPRequestHandler(http.server.SimpleHTTPRequestHandler):
    def end_headers(self):
        self.send_header('Cache-Control', 'no-store, no-cache, must-revalidate, max-age=0')
        self.send_header('Pragma', 'no-cache')
        self.send_header('Expires', '0')
        self.send_header('Access-Control-Allow-Origin', '*')
        super().end_headers()

def run_server(port):
    socketserver.TCPServer.allow_reuse_address = True
    try:
        with socketserver.TCPServer(("", port), NoCacheHTTPRequestHandler) as httpd:
            print(f"Server live at http://localhost:{port}")
            httpd.serve_forever()
    except Exception as e:
        print(f"Port {port} error: {e}")

if __name__ == '__main__':
    os.chdir(os.path.dirname(os.path.abspath(__file__)))
    t1 = threading.Thread(target=run_server, args=(3000,), daemon=True)
    t2 = threading.Thread(target=run_server, args=(5000,), daemon=True)
    t1.start()
    t2.start()
    print("Dual servers started on http://localhost:3000 and http://localhost:5000")
    t1.join()
